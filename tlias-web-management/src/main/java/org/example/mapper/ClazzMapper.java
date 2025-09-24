package org.example.mapper;

import org.example.pojo.Clazz;
import org.example.pojo.ClazzQueryParam;

import java.util.List;

public interface ClazzMapper {

    List<Clazz> list(ClazzQueryParam clazzQueryParam);
}
