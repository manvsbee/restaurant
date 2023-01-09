INSERT INTO `client` (`nume`, `prenume`, `numar_tlf`, `email`)
VALUES ('Georgescu', 'George', '+40111111111', 'georgescu@mai.com');

INSERT INTO `client` (`nume`, `prenume`, `numar_tlf`, `email`)
VALUES ('Petrescu', 'Petre', '+40222222222', 'petrescu@mai.com');

INSERT INTO `client` (`nume`, `prenume`, `numar_tlf`, `email`)
VALUES ('Stefanescu', 'Stefan', '+40333333333', 'stefanescu@mai.com');

INSERT INTO `preparat` (`nume`, `descriere`, `pret`)
VALUES ('Sarmale', 'Sarmalute in varza', '13');

INSERT INTO `preparat` (`nume`, `descriere`, `pret`)
VALUES ('Ceafa', 'Ceafa de porc', '8');

INSERT INTO `preparat` (`nume`, `descriere`, `pret`)
VALUES ('Bulz', 'Bulz din mamaliga cu ou si telemea', '20');

INSERT INTO `comanda` (`id_client`, `data`, `status`)
VALUES ('2', '2022-12-31 23.59.59', 'IN_PROGRESS');

INSERT INTO `comanda_preparat` (`id_comanda`, `id_preparat`)
VALUES ('1', '2');