package com.dejing.bootlaunch.utils;

import org.dozer.DozerBeanMapper;
import com.google.common.collect.Lists;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;

//@Autowired
//protected Mapper dozerMapper;
public class DozerUtils {
  static DozerBeanMapper dozerBeanMapper = new DozerBeanMapper();

  public static <T> List<T> mapList(Collection sourceList, Class<T> destinationClass) {
    List destinationList = Lists.newArrayList();
    for (Iterator i$ = sourceList.iterator(); i$.hasNext(); ) {
      Object sourceObject = i$.next();
      Object destinationObject = dozerBeanMapper.map(sourceObject, destinationClass);
      destinationList.add(destinationObject);
    }
    return destinationList;
  }
}
