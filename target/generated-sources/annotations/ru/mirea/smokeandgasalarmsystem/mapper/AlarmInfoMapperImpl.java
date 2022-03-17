package ru.mirea.smokeandgasalarmsystem.mapper;

import javax.annotation.Generated;
import ru.mirea.smokeandgasalarmsystem.model.domain.AlarmInfo;
import ru.mirea.smokeandgasalarmsystem.model.entity.AlarmInfoEntity;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-03-17T09:53:23+0300",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 15.0.1 (Oracle Corporation)"
)
public class AlarmInfoMapperImpl implements AlarmInfoMapper {

    @Override
    public AlarmInfoEntity domainToEntity(AlarmInfo alarmInfo) {
        if ( alarmInfo == null ) {
            return null;
        }

        AlarmInfoEntity alarmInfoEntity = new AlarmInfoEntity();

        alarmInfoEntity.setId( alarmInfo.getId() );
        alarmInfoEntity.setDevice( alarmInfo.getDevice() );
        alarmInfoEntity.setDescription( alarmInfo.getDescription() );
        alarmInfoEntity.setResolveStatus( alarmInfo.getResolveStatus() );
        alarmInfoEntity.setTimestamp( alarmInfo.getTimestamp() );

        return alarmInfoEntity;
    }

    @Override
    public AlarmInfo entityToDomain(AlarmInfoEntity alarmInfoEntity) {
        if ( alarmInfoEntity == null ) {
            return null;
        }

        AlarmInfo alarmInfo = new AlarmInfo();

        alarmInfo.setId( alarmInfoEntity.getId() );
        alarmInfo.setDevice( alarmInfoEntity.getDevice() );
        alarmInfo.setDescription( alarmInfoEntity.getDescription() );
        alarmInfo.setResolveStatus( alarmInfoEntity.getResolveStatus() );
        alarmInfo.setTimestamp( alarmInfoEntity.getTimestamp() );

        return alarmInfo;
    }
}
