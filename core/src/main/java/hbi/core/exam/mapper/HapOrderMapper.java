package hbi.core.exam.mapper;

import hbi.core.exam.dto.HapOrder;
import hbi.core.exam.dto.Page;

import java.util.List;

/**
 * Created by 袁媛 on 2017/1/11.
 */
public interface HapOrderMapper {
 public   List<HapOrder> findAll(Page<HapOrder> page);
 public Long   findCount(Page<HapOrder> page);
}
