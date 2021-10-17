--
-- Table structure for table employment
--

CREATE TABLE employments (
  employee_id BIGINT NOT NULL AUTO_INCREMENT,
  citizen_id BIGINT NOT NULL,
  division_id BIGINT NOT NULL,
  join_date DATE NOT NULL,
  leave_date DATE,
  PRIMARY KEY (employee_id),
  FOREIGN KEY (division_id) REFERENCES divisions (id)
);