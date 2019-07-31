(ns org.deeplearning4j.models.embeddings.wordvectors.WordVectors
  "Word vectors. Handles operations based on the lookup table
 and vocab."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.models.embeddings.wordvectors WordVectors]))

(defn get-word-vector
  "Get the word vector for a given matrix

  word - the word to get the matrix for - `java.lang.String`

  returns: the ndarray for this word - `double[]`"
  ([^WordVectors this ^java.lang.String word]
    (-> this (.getWordVector word))))

(defn lookup-table
  "Lookup table for the vectors

  returns: `org.deeplearning4j.models.embeddings.WeightLookupTable`"
  (^org.deeplearning4j.models.embeddings.WeightLookupTable [^WordVectors this]
    (-> this (.lookupTable))))

(defn get-word-vectors-mean
  "This method returns mean vector, built from words/labels passed in

  labels - `java.util.Collection`

  returns: `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^WordVectors this ^java.util.Collection labels]
    (-> this (.getWordVectorsMean labels))))

(defn words-nearest-sum
  "Words nearest based on positive and negative words

  positive - the positive words - `java.util.Collection`
  negative - the negative words - `java.util.Collection`
  top - the top n words - `int`

  returns: the words nearest the mean of the words - `java.util.Collection<java.lang.String>`"
  (^java.util.Collection [^WordVectors this ^java.util.Collection positive ^java.util.Collection negative ^Integer top]
    (-> this (.wordsNearestSum positive negative top)))
  (^java.util.Collection [^WordVectors this ^java.lang.String word ^Integer n]
    (-> this (.wordsNearestSum word n))))

(defn has-word?
  "Returns true if the model has this word in the vocab

  word - the word to test for - `java.lang.String`

  returns: true if the model has the word in the vocab - `boolean`"
  (^Boolean [^WordVectors this ^java.lang.String word]
    (-> this (.hasWord word))))

(defn similarity
  "Returns the similarity of 2 words

  word - the first word - `java.lang.String`
  word-2 - the second word - `java.lang.String`

  returns: a normalized similarity (cosine similarity) - `double`"
  (^Double [^WordVectors this ^java.lang.String word ^java.lang.String word-2]
    (-> this (.similarity word word-2))))

(defn vocab
  "Vocab for the vectors

  returns: `org.deeplearning4j.models.word2vec.wordstore.VocabCache`"
  (^org.deeplearning4j.models.word2vec.wordstore.VocabCache [^WordVectors this]
    (-> this (.vocab))))

(defn get-word-vector-matrix-normalized
  "Returns the word vector divided by the norm2 of the array

  word - the word to get the matrix for - `java.lang.String`

  returns: the looked up matrix - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^WordVectors this ^java.lang.String word]
    (-> this (.getWordVectorMatrixNormalized word))))

(defn get-unk
  "returns: `java.lang.String`"
  (^java.lang.String [^WordVectors this]
    (-> this (.getUNK))))

(defn set-model-utils
  "Specifies ModelUtils to be used to access model

  utils - `org.deeplearning4j.models.embeddings.reader.ModelUtils`"
  ([^WordVectors this ^org.deeplearning4j.models.embeddings.reader.ModelUtils utils]
    (-> this (.setModelUtils utils))))

(defn similar-words-in-vocab-to
  "Find all words with a similar characters
  in the vocab

  word - the word to compare - `java.lang.String`
  accuracy - the accuracy: 0 to 1 - `double`

  returns: the list of words that are similar in the vocab - `java.util.List<java.lang.String>`"
  (^java.util.List [^WordVectors this ^java.lang.String word ^Double accuracy]
    (-> this (.similarWordsInVocabTo word accuracy))))

(defn set-unk
  "new-unk - `java.lang.String`"
  ([^WordVectors this ^java.lang.String new-unk]
    (-> this (.setUNK new-unk))))

(defn get-word-vectors
  "This method returns 2D array, where each row represents corresponding word/label

  labels - `java.util.Collection`

  returns: `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^WordVectors this ^java.util.Collection labels]
    (-> this (.getWordVectors labels))))

(defn get-word-vector-matrix
  "Get the word vector for a given matrix

  word - the word to get the matrix for - `java.lang.String`

  returns: the ndarray for this word - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^WordVectors this ^java.lang.String word]
    (-> this (.getWordVectorMatrix word))))

(defn index-of
  "word - `java.lang.String`

  returns: `int`"
  (^Integer [^WordVectors this ^java.lang.String word]
    (-> this (.indexOf word))))

(defn accuracy
  "Accuracy based on questions which are a space separated list of strings
  where the first word is the query word, the next 2 words are negative,
  and the last word is the predicted word to be nearest

  questions - the questions to ask - `java.util.List`

  returns: the accuracy based on these questions - `java.util.Map<java.lang.String,java.lang.Double>`"
  (^java.util.Map [^WordVectors this ^java.util.List questions]
    (-> this (.accuracy questions))))

(defn words-nearest
  "Words nearest based on positive and negative words

  positive - the positive words - `java.util.Collection`
  negative - the negative words - `java.util.Collection`
  top - the top n words - `int`

  returns: the words nearest the mean of the words - `java.util.Collection<java.lang.String>`"
  (^java.util.Collection [^WordVectors this ^java.util.Collection positive ^java.util.Collection negative ^Integer top]
    (-> this (.wordsNearest positive negative top)))
  (^java.util.Collection [^WordVectors this ^java.lang.String word ^Integer n]
    (-> this (.wordsNearest word n))))

