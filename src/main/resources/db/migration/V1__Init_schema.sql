--
-- Table structure for table companies
--

CREATE TABLE companies (
  id BIGINT AUTO_INCREMENT,
  name varchar(50) NOT NULL,
  PRIMARY KEY (id)
);

--
-- Table structure for table divisions
--

CREATE TABLE divisions (
  id BIGINT AUTO_INCREMENT,
  company_id BIGINT,
  name varchar(50) NOT NULL,
  PRIMARY KEY (id),
  FOREIGN KEY (company_id) REFERENCES companies (id)
);