(ns org.deeplearning4j.nearestneighbor.server.NearestNeighborsServer
  "A rest server for using an
 VPTree based on loading an ndarray containing
 the data points for the path
 The input values are an CSVRecord
 which (based on the input schema) will automatically
 have their values transformed."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.nearestneighbor.server NearestNeighborsServer]))

(defn ->nearest-neighbors-server
  "Constructor."
  (^NearestNeighborsServer []
    (new NearestNeighborsServer )))

(defn *main
  "args - `java.lang.String[]`

  throws: java.lang.Exception"
  ([args]
    (NearestNeighborsServer/main args)))

(defn run-main
  "args - `java.lang.String`

  throws: java.lang.Exception"
  ([^NearestNeighborsServer this ^java.lang.String args]
    (-> this (.runMain args))))

(defn stop
  "Stop the server"
  ([^NearestNeighborsServer this]
    (-> this (.stop))))

