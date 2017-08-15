-- membuat schema databasezk_web_mvc@localhost
CREATE USER zk_web_mvc WITH SUPERUSER
  LOGIN
  PASSWORD 'zk_web_mvc';
-- membuat database
CREATE DATABASE zk_web_mvc WITH OWNER zk_web_mvc;
-- membuat table m_cars
CREATE TABLE m_cars (
  id          SERIAL                NOT NULL PRIMARY KEY,
  model       CHARACTER VARYING(25) NOT NULL,
  make        CHARACTER VARYING(50) NOT NULL,
  preview     CHARACTER VARYING(100),
  description CHARACTER VARYING(255),
  price       DECIMAL(10, 2)
);
-- membuat data ke table m_cars
INSERT INTO m_cars (model, make, preview, description, price) VALUES (?, ?, ?, ?, ?)