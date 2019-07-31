(ns org.deeplearning4j.nearestneighbor.model.NearestNeighborsResult
  "Created by agibsonccc on 4/26/17."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.nearestneighbor.model NearestNeighborsResult]))

(defn ->nearest-neighbors-result
  "Constructor.

  index - `int`
  distance - `double`"
  (^NearestNeighborsResult [^Integer index ^Double distance]
    (new NearestNeighborsResult index distance)))

