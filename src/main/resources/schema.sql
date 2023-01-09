CREATE TABLE client (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nume VARCHAR(20) NOT NULL,
    prenume VARCHAR(20) NOT NULL,
    numar_tlf VARCHAR(20) NOT NULL,
    email VARCHAR(20) NOT NULL
);

CREATE TABLE comanda (
    id INT AUTO_INCREMENT PRIMARY KEY,
    id_client INT NOT NULL ,
    data TIMESTAMP NOT NULL,
    status VARCHAR(15) NOT NULL,
    FOREIGN KEY (id_client) REFERENCES client(id)
);

CREATE TABLE preparat (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nume VARCHAR(20) NOT NULL,
    descriere VARCHAR(50) NOT NULL,
    pret INT NOT NULL
);

CREATE TABLE comanda_preparat (
    id INT AUTO_INCREMENT PRIMARY KEY,
    id_comanda INT NOT NULL,
    id_preparat INT NOT NULL,
    FOREIGN KEY (id_comanda) REFERENCES comanda(id),
    FOREIGN KEY (id_preparat) REFERENCES preparat(id)
);

