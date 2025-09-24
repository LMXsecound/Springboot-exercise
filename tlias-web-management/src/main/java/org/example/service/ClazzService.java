package org.example.service;

import org.example.pojo.ClazzQueryParam;
import org.example.pojo.PageResult;

public interface ClazzService {

    PageResult page(ClazzQueryParam empQueryParam);
}
