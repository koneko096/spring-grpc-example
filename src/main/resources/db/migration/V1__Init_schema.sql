--
-- Table structure for table companies
--

CREATE TABLE companies (
  id BIGINT IDENTITY PRIMARY KEY,
  name varchar(50) NOT NULL
);

--
-- Table structure for table divisions
--

CREATE TABLE divisions (
  id BIGINT IDENTITY PRIMARY KEY,
  company_id BIGINT FOREIGN KEY REFERENCES companies,
  name varchar(50) NOT NULL
);