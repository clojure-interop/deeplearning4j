(ns org.deeplearning4j.api.storage.StatsStorageEvent
  "StatsStorageEvent: use with StatsStorageListener to specify when the state of the StatsStorage
 implementation changes.
 Note that depending on the StatsStorageListener.EventType, some of the
 field may be null."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.api.storage StatsStorageEvent]))

(defn ->stats-storage-event
  "Constructor."
  (^StatsStorageEvent []
    (new StatsStorageEvent )))

