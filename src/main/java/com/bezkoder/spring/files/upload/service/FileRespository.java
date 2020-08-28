package com.bezkoder.spring.files.upload.service;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bezkoder.spring.files.upload.model.FileInfo;

public interface FileRespository extends JpaRepository<FileInfo, String>{

}
