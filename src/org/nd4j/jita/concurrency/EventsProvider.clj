(ns org.nd4j.jita.concurrency.EventsProvider
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.jita.concurrency EventsProvider]))

(defn ->events-provider
  "Constructor."
  (^EventsProvider []
    (new EventsProvider )))

(defn get-event
  "returns: `org.nd4j.jita.allocator.pointers.cuda.cudaEvent_t`"
  (^org.nd4j.jita.allocator.pointers.cuda.cudaEvent_t [^EventsProvider this]
    (-> this (.getEvent))))

(defn store-event
  "event - `org.nd4j.jita.allocator.pointers.cuda.cudaEvent_t`"
  ([^EventsProvider this ^org.nd4j.jita.allocator.pointers.cuda.cudaEvent_t event]
    (-> this (.storeEvent event))))

(defn get-events-number
  "returns: `long`"
  (^Long [^EventsProvider this]
    (-> this (.getEventsNumber))))

(defn get-cached-number
  "returns: `long`"
  (^Long [^EventsProvider this]
    (-> this (.getCachedNumber))))

