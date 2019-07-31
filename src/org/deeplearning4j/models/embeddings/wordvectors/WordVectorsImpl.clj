(ns org.deeplearning4j.models.embeddings.wordvectors.WordVectorsImpl
  "Common word vector operations"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.models.embeddings.wordvectors WordVectorsImpl]))

(defn ->word-vectors-impl
  "Constructor."
  (^WordVectorsImpl []
    (new WordVectorsImpl )))

(def *-default-unk
  "Static Constant.

  type: java.lang.String"
  WordVectorsImpl/DEFAULT_UNK)

(defn get-word-vector
  "Get the word vector for a given matrix

  word - the word to get the matrix for - `java.lang.String`

  returns: the ndarray for this word - `double[]`"
  ([^WordVectorsImpl this ^java.lang.String word]
    (-> this (.getWordVector word))))

(defn lookup-table
  "Description copied from interface: WordVectors

  returns: `org.deeplearning4j.models.embeddings.WeightLookupTable`"
  (^org.deeplearning4j.models.embeddings.WeightLookupTable [^WordVectorsImpl this]
    (-> this (.lookupTable))))

(defn get-layer-size
  "This method returns word vector size

  returns: `int`"
  (^Integer [^WordVectorsImpl this]
    (-> this (.getLayerSize))))

(defn get-word-vectors-mean
  "This method returns mean vector, built from words/labels passed in

  labels - `java.util.Collection`

  returns: `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^WordVectorsImpl this ^java.util.Collection labels]
    (-> this (.getWordVectorsMean labels))))

(defn words-nearest-sum
  "Words nearest based on positive and negative words

  positive - the positive words - `java.util.Collection`
  negative - the negative words - `java.util.Collection`
  top - the top n words - `int`

  returns: the words nearest the mean of the words - `java.util.Collection<java.lang.String>`"
  (^java.util.Collection [^WordVectorsImpl this ^java.util.Collection positive ^java.util.Collection negative ^Integer top]
    (-> this (.wordsNearestSum positive negative top)))
  (^java.util.Collection [^WordVectorsImpl this ^org.nd4j.linalg.api.ndarray.INDArray words ^Integer top]
    (-> this (.wordsNearestSum words top))))

(defn has-word?
  "Returns true if the model has this word in the vocab

  word - the word to test for - `java.lang.String`

  returns: true if the model has the word in the vocab - `boolean`"
  (^Boolean [^WordVectorsImpl this ^java.lang.String word]
    (-> this (.hasWord word))))

(defn similarity
  "Returns similarity of two elements, provided by ModelUtils

  word - the first word - `java.lang.String`
  word-2 - the second word - `java.lang.String`

  returns: a normalized similarity (cosine similarity) - `double`"
  (^Double [^WordVectorsImpl this ^java.lang.String word ^java.lang.String word-2]
    (-> this (.similarity word word-2))))

(defn set-lookup-table
  "lookup-table - `org.deeplearning4j.models.embeddings.WeightLookupTable`"
  ([^WordVectorsImpl this ^org.deeplearning4j.models.embeddings.WeightLookupTable lookup-table]
    (-> this (.setLookupTable lookup-table))))

(defn vocab
  "Description copied from interface: WordVectors

  returns: `org.deeplearning4j.models.word2vec.wordstore.VocabCache<T>`"
  (^org.deeplearning4j.models.word2vec.wordstore.VocabCache [^WordVectorsImpl this]
    (-> this (.vocab))))

(defn get-word-vector-matrix-normalized
  "Returns the word vector divided by the norm2 of the array

  word - the word to get the matrix for - `java.lang.String`

  returns: the looked up matrix - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^WordVectorsImpl this ^java.lang.String word]
    (-> this (.getWordVectorMatrixNormalized word))))

(defn set-model-utils
  "Description copied from interface: WordVectors

  model-utils - `org.deeplearning4j.models.embeddings.reader.ModelUtils`"
  ([^WordVectorsImpl this ^org.deeplearning4j.models.embeddings.reader.ModelUtils model-utils]
    (-> this (.setModelUtils model-utils))))

(defn set-vocab
  "vocab - `org.deeplearning4j.models.word2vec.wordstore.VocabCache`"
  ([^WordVectorsImpl this ^org.deeplearning4j.models.word2vec.wordstore.VocabCache vocab]
    (-> this (.setVocab vocab))))

(defn similar-words-in-vocab-to
  "Find all words with a similar characters
  in the vocab

  word - the word to compare - `java.lang.String`
  accuracy - the accuracy: 0 to 1 - `double`

  returns: the list of words that are similar in the vocab - `java.util.List<java.lang.String>`"
  (^java.util.List [^WordVectorsImpl this ^java.lang.String word ^Double accuracy]
    (-> this (.similarWordsInVocabTo word accuracy))))

(defn get-word-vectors
  "This method returns 2D array, where each row represents corresponding label

  labels - `java.util.Collection`

  returns: `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^WordVectorsImpl this ^java.util.Collection labels]
    (-> this (.getWordVectors labels))))

(defn get-word-vector-matrix
  "Description copied from interface: WordVectors

  word - the word to get the matrix for - `java.lang.String`

  returns: the ndarray for this word - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^WordVectorsImpl this ^java.lang.String word]
    (-> this (.getWordVectorMatrix word))))

(defn index-of
  "word - `java.lang.String`

  returns: `int`"
  (^Integer [^WordVectorsImpl this ^java.lang.String word]
    (-> this (.indexOf word))))

(defn accuracy
  "Accuracy based on questions which are a space separated list of strings
  where the first word is the query word, the next 2 words are negative,
  and the last word is the predicted word to be nearest

  questions - the questions to ask - `java.util.List`

  returns: the accuracy based on these questions - `java.util.Map<java.lang.String,java.lang.Double>`"
  (^java.util.Map [^WordVectorsImpl this ^java.util.List questions]
    (-> this (.accuracy questions))))

(defn words-nearest
  "Words nearest based on positive and negative words

  positive - the positive words - `java.util.Collection`
  negative - the negative words - `java.util.Collection`
  top - the top n words - `int`

  returns: the words nearest the mean of the words - `java.util.Collection<java.lang.String>`"
  (^java.util.Collection [^WordVectorsImpl this ^java.util.Collection positive ^java.util.Collection negative ^Integer top]
    (-> this (.wordsNearest positive negative top)))
  (^java.util.Collection [^WordVectorsImpl this ^org.nd4j.linalg.api.ndarray.INDArray words ^Integer top]
    (-> this (.wordsNearest words top))))

