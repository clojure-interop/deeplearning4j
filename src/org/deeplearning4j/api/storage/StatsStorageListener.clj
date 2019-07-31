(ns org.deeplearning4j.api.storage.StatsStorageListener
  "A listener interface, so that classes can be notified of changes to a StatsStorage
 implementation"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.api.storage StatsStorageListener]))

(defn notify
  "Notify will be called whenever an event (new information posted, etc) occurs.
  Processing these events should ideally be done asynchronously.

  event - Event that occurred - `org.deeplearning4j.api.storage.StatsStorageEvent`"
  ([^StatsStorageListener this ^org.deeplearning4j.api.storage.StatsStorageEvent event]
    (-> this (.notify event))))

