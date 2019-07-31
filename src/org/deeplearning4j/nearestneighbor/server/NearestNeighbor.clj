(ns org.deeplearning4j.nearestneighbor.server.NearestNeighbor
  "Created by agibsonccc on 4/27/17."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.nearestneighbor.server NearestNeighbor]))

(defn ->nearest-neighbor
  "Constructor."
  (^NearestNeighbor []
    (new NearestNeighbor )))

(defn search
  "returns: `java.util.List<org.deeplearning4j.nearestneighbor.model.NearestNeighborsResult>`"
  (^java.util.List [^NearestNeighbor this]
    (-> this (.search))))

