(ns org.deeplearning4j.ui.storage.impl.QueuePairStatsStorageListener
  "A very simple StatsStorageListener, that adds the StatsStorageEvent instances and the specified
 StatsStorage instance (i.e., the source) to the specified queue for later processing."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.ui.storage.impl QueuePairStatsStorageListener]))

(defn ->queue-pair-stats-storage-listener
  "Constructor."
  (^QueuePairStatsStorageListener []
    (new QueuePairStatsStorageListener )))

(defn notify
  "Description copied from interface: StatsStorageListener

  event - Event that occurred - `org.deeplearning4j.api.storage.StatsStorageEvent`"
  ([^QueuePairStatsStorageListener this ^org.deeplearning4j.api.storage.StatsStorageEvent event]
    (-> this (.notify event))))

