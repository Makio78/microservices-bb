ALTER TABLE  `gerenciar-colaborador`.gerenciar_colaborador
ADD CONSTRAINT FK_colaborador
FOREIGN KEY FK_colaborador(id)
REFERENCES `mba-colaborador`.colaborador(id)
ON DELETE RESTRICT
ON UPDATE RESTRICT;