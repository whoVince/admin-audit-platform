# Modelo de segurança

Autorização combina tenant, papel e permissão sobre o recurso. O servidor não
confia em um tenant enviado pelo cliente: ele é obtido da identidade autenticada.
Registros de auditoria são append-only, possuem `correlationId` e não armazenam
segredos ou tokens.
