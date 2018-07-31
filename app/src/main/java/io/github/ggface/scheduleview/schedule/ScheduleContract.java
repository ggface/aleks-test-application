package io.github.ggface.scheduleview.schedule;

import android.support.annotation.NonNull;

import java.util.Date;
import java.util.List;

import io.github.ggface.api.beans.EventBean;
import io.github.ggface.scheduleview.mvp.BasePresenter;
import io.github.ggface.scheduleview.mvp.BaseView;


/**
 * Контракт для экрана расписания {@link ScheduleActivity}
 *
 * @author Ivan Novikov on 2018-07-31.
 */
public interface ScheduleContract {

    interface View extends BaseView<Presenter> {

        /**
         * Сообщает о смене списка событий
         *
         * @param events список событий
         */
        void onEventsChanged(List<EventBean> events);
    }

    interface Presenter extends BasePresenter {

        /**
         * Запрос на получение событий
         *
         * @param date дата для выборки событий
         */
        void obtainEvents(@NonNull Date date);
    }
}