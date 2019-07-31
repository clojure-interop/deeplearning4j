(ns org.deeplearning4j.nearestneighbor.client.NearestNeighborsClient
  "Client for the nearest neighbors server.
 To create a client, pass in a host port combination with the following format:
 http://host:port"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.nearestneighbor.client NearestNeighborsClient]))

(defn ->nearest-neighbors-client
  "Constructor.

  url - `java.lang.String`"
  (^NearestNeighborsClient [^java.lang.String url]
    (new NearestNeighborsClient url)))

(defn knn
  "Runs knn on the given index
  with the given k (note that this is for data
  already within the existing dataset not new data)

  index - the index of theEXISTING ndarrayto run a search on - `int`
  k - the number of results - `int`

  returns: `org.deeplearning4j.nearestneighbor.model.NearestNeighborsResults`

  throws: java.lang.Exception"
  (^org.deeplearning4j.nearestneighbor.model.NearestNeighborsResults [^NearestNeighborsClient this ^Integer index ^Integer k]
    (-> this (.knn index k))))

(defn knn-new
  "Run a k nearest neighbors search
  on a NEW data point

  k - the number of resultsto retrieve - `int`
  arr - the array to run the search on.Note that this must be a row vector - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: `org.deeplearning4j.nearestneighbor.model.NearestNeighborsResults`

  throws: java.lang.Exception"
  (^org.deeplearning4j.nearestneighbor.model.NearestNeighborsResults [^NearestNeighborsClient this ^Integer k ^org.nd4j.linalg.api.ndarray.INDArray arr]
    (-> this (.knnNew k arr))))

