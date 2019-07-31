(ns org.nd4j.api.loader.Loader
  "A simple interface for loading objects from a Source object"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.api.loader Loader]))

(defn load
  "source - `org.nd4j.api.loader.Source`

  returns: `T`

  throws: java.io.IOException"
  ([^Loader this ^org.nd4j.api.loader.Source source]
    (-> this (.load source))))

