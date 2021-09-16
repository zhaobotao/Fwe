package com.flyt.fwe.service;

import com.flyt.fwe.domain.FweClassroom;
import java.util.List;

/**
 * 教室 服务层
 * 
 * @author Wwang
 * @date 2019-06-17
 */
public interface IFweClassroomService 
{
	/**
     * 查询教室信息
     * 
     * @param id 教室ID
     * @return 教室信息
     */
	public FweClassroom selectFweClassroomById(Long id);
	
	/**
     * 查询教室列表
     * 
     * @param fweClassroom 教室信息
     * @return 教室集合
     */
	public List<FweClassroom> selectFweClassroomList(FweClassroom fweClassroom);
	
	/**
     * 新增教室
     * 
     * @param fweClassroom 教室信息
     * @return 结果
     */
	public int insertFweClassroom(FweClassroom fweClassroom);
	
	/**
     * 修改教室
     * 
     * @param fweClassroom 教室信息
     * @return 结果
     */
	public int updateFweClassroom(FweClassroom fweClassroom);
		
	/**
     * 删除教室信息
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
	public int deleteFweClassroomByIds(String ids);
	
}
