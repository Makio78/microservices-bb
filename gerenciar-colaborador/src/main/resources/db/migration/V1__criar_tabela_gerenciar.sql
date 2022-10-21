CREATE TABLE gerenciar_colaborador (
  id bigint(20) NOT NULL AUTO_INCREMENT,
  trilha_id bigint(20) NOT NULL,
  colaborador_id bigint(20) NOT NULL,
  status varchar(100) NOT NULL,
  PRIMARY KEY (id)
)