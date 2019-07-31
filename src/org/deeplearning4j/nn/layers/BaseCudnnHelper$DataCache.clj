(ns org.deeplearning4j.nn.layers.BaseCudnnHelper$DataCache
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.nn.layers BaseCudnnHelper$DataCache]))

(defn ->data-cache
  "Constructor.

  size - `long`"
  (^BaseCudnnHelper$DataCache [^Long size]
    (new BaseCudnnHelper$DataCache size))
  (^BaseCudnnHelper$DataCache []
    (new BaseCudnnHelper$DataCache )))

