(ns org.deeplearning4j.nn.modelimport.keras.preprocessing.text.KerasTokenizer
  "Java port of Keras' text tokenizer, see https://keras.io/preprocessing/text/ for more information."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.nn.modelimport.keras.preprocessing.text KerasTokenizer]))

(defn ->keras-tokenizer
  "Constructor.

  Create a Keras Tokenizer instance with full set of properties.

  num-words - The maximum vocabulary size, can be null - `java.lang.Integer`
  filters - Characters to filter - `java.lang.String`
  lower - whether to lowercase input or not - `boolean`
  split - by which string to split words (usually single space) - `java.lang.String`
  char-level - whether to operate on character- or word-level - `boolean`
  out-of-vocabulary-token - replace items outside the vocabulary by this token - `java.lang.String`"
  (^KerasTokenizer [^java.lang.Integer num-words ^java.lang.String filters ^Boolean lower ^java.lang.String split ^Boolean char-level ^java.lang.String out-of-vocabulary-token]
    (new KerasTokenizer num-words filters lower split char-level out-of-vocabulary-token))
  (^KerasTokenizer [^java.lang.Integer num-words]
    (new KerasTokenizer num-words))
  (^KerasTokenizer []
    (new KerasTokenizer )))

(defn *from-json
  "Import Keras Tokenizer from JSON file created with `tokenizer.to_json()` in Python.

  json-file-name - Full path of the JSON file to load - `java.lang.String`

  returns: Keras Tokenizer instance loaded from JSON - `org.deeplearning4j.nn.modelimport.keras.preprocessing.text.KerasTokenizer`

  throws: java.io.IOException - I/O exception"
  (^org.deeplearning4j.nn.modelimport.keras.preprocessing.text.KerasTokenizer [^java.lang.String json-file-name]
    (KerasTokenizer/fromJson json-file-name)))

(defn *text-to-word-sequence
  "Turns a String text into a sequence of tokens.

  text - input text - `java.lang.String`
  filters - characters to filter - `java.lang.String`
  lower - whether to lowercase input or not - `boolean`
  split - by which string to split words (usually single space) - `java.lang.String`

  returns: Sequence of tokens as String array - `java.lang.String[]`"
  ([^java.lang.String text ^java.lang.String filters ^Boolean lower ^java.lang.String split]
    (KerasTokenizer/textToWordSequence text filters lower split)))

(defn fit-on-texts
  "Fit this tokenizer on a corpus of texts.

  texts - array of strings to fit tokenizer on. - `java.lang.String[]`"
  ([^KerasTokenizer this texts]
    (-> this (.fitOnTexts texts))))

(defn fit-on-sequences
  "Fit this tokenizer on a corpus of word indices

  sequences - array of indices derived from a text. - `java.lang.Integer[][]`"
  ([^KerasTokenizer this sequences]
    (-> this (.fitOnSequences sequences))))

(defn texts-to-sequences
  "Transforms a bunch of texts into their index representations.

  texts - input texts - `java.lang.String[]`

  returns: array of indices of the texts - `java.lang.Integer[][]`"
  ([^KerasTokenizer this texts]
    (-> this (.textsToSequences texts))))

(defn sequences-to-texts
  "Turns index sequences back into texts

  sequences - index sequences - `java.lang.Integer[][]`

  returns: text reconstructed from sequences - `java.lang.String[]`"
  ([^KerasTokenizer this sequences]
    (-> this (.sequencesToTexts sequences))))

(defn texts-to-matrix
  "Turns an array of texts into an ND4J matrix of shape
  (number of texts, number of words in vocabulary)

  texts - input texts - `java.lang.String[]`
  mode - TokenizerMode that controls how to vectorize data - `org.deeplearning4j.nn.modelimport.keras.preprocessing.text.TokenizerMode`

  returns: resulting matrix representation - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^KerasTokenizer this texts ^org.deeplearning4j.nn.modelimport.keras.preprocessing.text.TokenizerMode mode]
    (-> this (.textsToMatrix texts mode))))

(defn sequences-to-matrix
  "Turns an array of index sequences into an ND4J matrix of shape
  (number of texts, number of words in vocabulary)

  sequences - input sequences - `java.lang.Integer[][]`
  mode - TokenizerMode that controls how to vectorize data - `org.deeplearning4j.nn.modelimport.keras.preprocessing.text.TokenizerMode`

  returns: resulting matrix representatio - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^KerasTokenizer this sequences ^org.deeplearning4j.nn.modelimport.keras.preprocessing.text.TokenizerMode mode]
    (-> this (.sequencesToMatrix sequences mode))))

