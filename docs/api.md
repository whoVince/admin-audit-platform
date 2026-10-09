# API do MVP

| Método | Endpoint | Escopo |
| --- | --- | --- |
| GET | `/api/audit?page=0` | Auditoria paginada |
| POST | `/api/users` | Usuário administrativo |
| PUT | `/api/roles/{id}/permissions` | Permissões |

Toda mutação deve gerar um registro de auditoria antes de responder sucesso.
