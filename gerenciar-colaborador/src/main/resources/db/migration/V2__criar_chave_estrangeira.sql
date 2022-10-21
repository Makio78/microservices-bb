ALTER TABLE  `gerenciar-colaborador`.gerenciar_colaborador
ADD CONSTRAINT FK_trilhas
FOREIGN KEY FK_trilhas(id)
REFERENCES `mba-trilhas`.trilhas(id)
ON DELETE RESTRICT
ON UPDATE RESTRICT;