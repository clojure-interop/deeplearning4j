(ns org.nd4j.jita.allocator.time.TimeProvider
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.jita.allocator.time TimeProvider]))

(defn get-current-time
  "This methods returns time in some, yet unknown, quants.

  returns: `long`"
  (^Long [^TimeProvider this]
    (-> this (.getCurrentTime))))

