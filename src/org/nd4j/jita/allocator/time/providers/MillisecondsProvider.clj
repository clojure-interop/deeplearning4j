(ns org.nd4j.jita.allocator.time.providers.MillisecondsProvider
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.jita.allocator.time.providers MillisecondsProvider]))

(defn ->milliseconds-provider
  "Constructor."
  (^MillisecondsProvider []
    (new MillisecondsProvider )))

(defn get-current-time
  "This methods returns time in some, yet unknown, quants.

  returns: `long`"
  (^Long [^MillisecondsProvider this]
    (-> this (.getCurrentTime))))

