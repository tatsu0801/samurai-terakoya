CREATE TABLE IF NOT EXISTS Book information (
     Management ID INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
     Title VARCHAR(20) NOT NULL,  
     Title_kana VARCHAR(20),
     Number of turns INT(3) NOT NULL,
     Author name VARCHAR(10) NOT NULL,
     Author name_kana VARCHAR(10) NOT NULL,
     Publisher name VARCHAR(15) NOT NULL,
     created_at DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP,
     updated_at DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP
 );