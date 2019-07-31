(ns org.deeplearning4j.ui.storage.impl.QueueStatsStorageListener
  "A very simple StatsStorageListener, that adds the StatsStorageEvent instances to a provided queue
 for later processing."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.ui.storage.impl QueueStatsStorageListener]))

(defn ->queue-stats-storage-listener
  "Constructor."
  (^QueueStatsStorageListener []
    (new QueueStatsStorageListener )))

(defn notify
  "Description copied from interface: StatsStorageListener

  event - Event that occurred - `org.deeplearning4j.api.storage.StatsStorageEvent`"
  ([^QueueStatsStorageListener this ^org.deeplearning4j.api.storage.StatsStorageEvent event]
    (-> this (.notify event))))

