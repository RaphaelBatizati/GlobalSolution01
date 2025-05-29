CREATE TABLE compartimento (
    id BIGINT PRIMARY KEY AUTO_INCREMENT,
    nome_compartimento VARCHAR(100) NOT NULL,
    capacidade_maxima INT NOT NULL,
    localizacao VARCHAR(150) NOT NULL,
    tipo VARCHAR(50) NOT NULL
);
