(ns org.nd4j.jita.allocator.time.providers.OperativeProvider
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.jita.allocator.time.providers OperativeProvider]))

(defn ->operative-provider
  "Constructor."
  (^OperativeProvider []
    (new OperativeProvider )))

(defn get-current-time
  "This methods returns time in some, yet unknown, quants.

  returns: `long`"
  (^Long [^OperativeProvider this]
    (-> this (.getCurrentTime))))

