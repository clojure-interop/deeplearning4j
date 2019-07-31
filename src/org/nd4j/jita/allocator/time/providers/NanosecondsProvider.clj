(ns org.nd4j.jita.allocator.time.providers.NanosecondsProvider
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.jita.allocator.time.providers NanosecondsProvider]))

(defn ->nanoseconds-provider
  "Constructor."
  (^NanosecondsProvider []
    (new NanosecondsProvider )))

(defn get-current-time
  "This methods returns time in some, yet unknown, quants.

  returns: `long`"
  (^Long [^NanosecondsProvider this]
    (-> this (.getCurrentTime))))

