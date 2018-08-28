CREATE ROLE web_chat WITH
  NOSUPERUSER
  NOCREATEDB
  NOCREATEROLE
  LOGIN
  ENCRYPTED PASSWORD 'password';
CREATE DATABASE web_chat WITH OWNER = web_chat ENCODING = 'UTF8';
COMMIT;