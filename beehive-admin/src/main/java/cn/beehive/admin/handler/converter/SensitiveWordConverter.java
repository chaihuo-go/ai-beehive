package cn.beehive.admin.handler.converter;

import cn.beehive.admin.domain.vo.SensitiveWordVO;
import cn.beehive.base.domain.entity.SensitiveWordDO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

/**
 * @author hncboy
 * @date 2023-3-28
 * 敏感词相关转换
 */
@Mapper
public interface SensitiveWordConverter {

    SensitiveWordConverter INSTANCE = Mappers.getMapper(SensitiveWordConverter.class);

    /**
     * entityToVO
     *
     * @param sensitiveWordDOList sensitiveWordDOList
     * @return List<SensitiveWordVO>
     */
    List<SensitiveWordVO> entityToVO(List<SensitiveWordDO> sensitiveWordDOList);
}