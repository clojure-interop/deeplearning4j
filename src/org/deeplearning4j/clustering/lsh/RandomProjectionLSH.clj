(ns org.deeplearning4j.clustering.lsh.RandomProjectionLSH
  "This class implements Entropy LSH for the cosine distance, in order to preserve memory for large datasets.
 Entropy SLH is the LSH scheme of
 _Entropy based nearest neighbor search in high dimensions_
 R Panigrahy - SIAM 2006
 https://arxiv.org/pdf/cs/0510019.pdf
 To read more about LSH, in particular for the Cosine distance, see
 chapter 3 of :
 _Mining Massive Datasets_, Anand Rajaraman and Jeffrey Ullman
 http://www.mmds.org/
 The original development of LSH for the cosine distance is from
 Similarity estimation techniques from rounding algorithms
 MS Charikar - STOCS, 2002
 Note for high-precision or distributed settings, you should not
 use this and rather extend this to layered LSH ( https://arxiv.org/abs/1210.7057 )"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.clustering.lsh RandomProjectionLSH]))

(defn ->random-projection-lsh
  "Constructor.

  Creates a locality-sensitive hashing index for the cosine distance,
  a (d1, d2, (180 − d1)/180,(180 − d2)/180)-sensitive hash family before amplification

  hash-length - the length of the compared hash in an AND construction, - `int`
  num-tables - the entropy-equivalent of a nb of hash tables in an OR construction, implemented here with the multipleprobes of Panigraphi (op. cit). - `int`
  in-dimension - the dimendionality of the points being indexed - `int`
  radius - the radius of points to generate probes for. Instead of using multiple physical hash tables in an OR construction - `double`
  rng - a Random object to draw samples from - `org.nd4j.linalg.api.rng.Random`"
  (^RandomProjectionLSH [^Integer hash-length ^Integer num-tables ^Integer in-dimension ^Double radius ^org.nd4j.linalg.api.rng.Random rng]
    (new RandomProjectionLSH hash-length num-tables in-dimension radius rng))
  (^RandomProjectionLSH [^Integer hash-length ^Integer num-tables ^Integer in-dimension ^Double radius]
    (new RandomProjectionLSH hash-length num-tables in-dimension radius)))

(defn get-distance-measure
  "Description copied from interface: LSH

  returns: `java.lang.String`"
  (^java.lang.String [^RandomProjectionLSH this]
    (-> this (.getDistanceMeasure))))

(defn entropy
  "This picks uniformaly distributed random points on the unit of a sphere using the method of:
  An efficient method for generating uniformly distributed points on the surface of an n-dimensional sphere
  JS Hicks, RF Wheeling - Communications of the ACM, 1959

  data - a query to generate multiple probes for - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: `numTables` - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^RandomProjectionLSH this ^org.nd4j.linalg.api.ndarray.INDArray data]
    (-> this (.entropy data))))

(defn hash
  "Returns hash values for a particular query

  data - a query vector - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: its hashed value - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^RandomProjectionLSH this ^org.nd4j.linalg.api.ndarray.INDArray data]
    (-> this (.hash data))))

(defn make-index
  "Populates the index. Beware, not incremental, any further call replaces the index instead of adding to it.

  data - the vectors to index - `org.nd4j.linalg.api.ndarray.INDArray`"
  ([^RandomProjectionLSH this ^org.nd4j.linalg.api.ndarray.INDArray data]
    (-> this (.makeIndex data))))

(defn bucket
  "Description copied from interface: LSH

  query - a vector to find neighbors for - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: its approximate neighbors, unfiltered - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^RandomProjectionLSH this ^org.nd4j.linalg.api.ndarray.INDArray query]
    (-> this (.bucket query))))

(defn search
  "Description copied from interface: LSH

  query - a vector to find neighbors for - `org.nd4j.linalg.api.ndarray.INDArray`
  max-range - the maximum distance between results and the query - `double`

  returns: approximate neighbors within the distance bounds - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^RandomProjectionLSH this ^org.nd4j.linalg.api.ndarray.INDArray query ^Double max-range]
    (-> this (.search query max-range))))

