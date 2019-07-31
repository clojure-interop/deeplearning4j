(ns org.nd4j.linalg.api.shape.loop.coordinatefunction.CoordinateFunction
  "Coordinate function for handling
 1 or more calls based on a set of coordinates"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.api.shape.loop.coordinatefunction CoordinateFunction]))

(defn process
  "coord - `long[]`"
  ([^CoordinateFunction this coord]
    (-> this (.process coord))))

