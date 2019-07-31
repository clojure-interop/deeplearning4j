(ns org.deeplearning4j.clustering.lsh.LSH
  "This interface gathers the minimal elements for an LSH implementation
 See chapter 3 of :
 _Mining Massive Datasets_, Anand Rajaraman and Jeffrey Ullman
 http://www.mmds.org/"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.clustering.lsh LSH]))

(defn get-distance-measure
  "Returns an instance of the distance measure associated to the LSH family of this implementation.
  Beware, hashing families and their amplification constructs are distance-specific.

  returns: `java.lang.String`"
  (^java.lang.String [^LSH this]
    (-> this (.getDistanceMeasure))))

(defn get-hash-length
  "Returns the size of a hash compared against in one hashing bucket, corresponding to an AND construction
  denoting hashLength by h,
  amplifies a (d1, d2, p1, p2) hash family into a
  (d1, d2, p1^h, p2^h)-sensitive one (match probability is decreasing with h)

  returns: the length of the hash in the AND construction used by this index - `int`"
  (^Integer [^LSH this]
    (-> this (.getHashLength))))

(defn get-num-tables
  "denoting numTables by n,
  amplifies a (d1, d2, p1, p2) hash family into a
  (d1, d2, (1-p1^n), (1-p2^n))-sensitive one (match probability is increasing with n)

  returns: the # of hash tables in the OR construction used by this index - `int`"
  (^Integer [^LSH this]
    (-> this (.getNumTables))))

(defn get-in-dimension
  "returns: The dimension of the index vectors and queries - `int`"
  (^Integer [^LSH this]
    (-> this (.getInDimension))))

(defn make-index
  "Populates the index with data vectors.

  data - the vectors to index - `org.nd4j.linalg.api.ndarray.INDArray`"
  ([^LSH this ^org.nd4j.linalg.api.ndarray.INDArray data]
    (-> this (.makeIndex data))))

(defn bucket
  "Returns the set of all vectors that could approximately be considered negihbors of the query,
  without selection on the basis of distance or number of neighbors.

  query - a vector to find neighbors for - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: its approximate neighbors, unfiltered - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^LSH this ^org.nd4j.linalg.api.ndarray.INDArray query]
    (-> this (.bucket query))))

(defn search
  "Returns the approximate neighbors within a distance bound.

  query - a vector to find neighbors for - `org.nd4j.linalg.api.ndarray.INDArray`
  max-range - the maximum distance between results and the query - `double`

  returns: approximate neighbors within the distance bounds - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^LSH this ^org.nd4j.linalg.api.ndarray.INDArray query ^Double max-range]
    (-> this (.search query max-range))))

