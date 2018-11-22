--
-- Table structure for table employment
--

CREATE TABLE employments (
  employee_id BIGINT IDENTITY PRIMARY KEY,
  citizen_id BIGINT NOT NULL,
  division_id BIGINT FOREIGN KEY REFERENCES divisions,
  join_date DATE NOT NULL,
  leave_date DATE
);