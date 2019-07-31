(ns org.deeplearning4j.models.sequencevectors.sequence.SequenceElement
  "SequenceElement is basic building block for SequenceVectors. Any data sequence can be represented as ordered set of SequenceElements,
 and then one can learn distributed representation of each SequenceElement in this sequence using CBOW or SkipGram."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.models.sequencevectors.sequence SequenceElement]))

(defn ->sequence-element
  "Constructor."
  (^SequenceElement []
    (new SequenceElement )))

(defn *get-long-hash
  "string - `java.lang.String`

  returns: `long`"
  (^Long [^java.lang.String string]
    (SequenceElement/getLongHash string)))

(defn *mapper
  "returns: `org.nd4j.shade.jackson.databind.ObjectMapper`"
  (^org.nd4j.shade.jackson.databind.ObjectMapper []
    (SequenceElement/mapper )))

(defn label?
  "Returns whether this element was defined as label, or no

  returns: `boolean`"
  (^Boolean [^SequenceElement this]
    (-> this (.isLabel))))

(defn set-element-frequency
  "This method sets frequency value for this element

  value - `long`"
  ([^SequenceElement this ^Long value]
    (-> this (.setElementFrequency value))))

(defn set-sequences-count
  "This method sets documents count to specified value

  count - `long`"
  ([^SequenceElement this ^Long count]
    (-> this (.setSequencesCount count))))

(defn set-historical-gradient
  "Deprecated.

  gradient - `org.nd4j.linalg.api.ndarray.INDArray`"
  ([^SequenceElement this ^org.nd4j.linalg.api.ndarray.INDArray gradient]
    (-> this (.setHistoricalGradient gradient))))

(defn get-index
  "Returns index in Huffman tree

  returns: index >= 0, if tree was built, -1 otherwise - `int`"
  (^Integer [^SequenceElement this]
    (-> this (.getIndex))))

(defn get-points
  "Returns Huffman tree points

  returns: `java.util.List<java.lang.Integer>`"
  (^java.util.List [^SequenceElement this]
    (-> this (.getPoints))))

(defn get-codes
  "Returns Huffman tree codes

  returns: `java.util.List<java.lang.Byte>`"
  (^java.util.List [^SequenceElement this]
    (-> this (.getCodes))))

(defn get-historical-gradient
  "Deprecated.

  returns: `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^SequenceElement this]
    (-> this (.getHistoricalGradient))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^SequenceElement this]
    (-> this (.toString))))

(defn get-element-frequency
  "This method returns SequenceElement's frequency in current training corpus.

  returns: `double`"
  (^Double [^SequenceElement this]
    (-> this (.getElementFrequency))))

(defn get-code-length
  "Returns Huffman code length.
  Please note: maximum vocabulary/tree size depends on code length

  returns: `int`"
  (^Integer [^SequenceElement this]
    (-> this (.getCodeLength))))

(defn increase-element-frequency
  "Increases element frequency counter by argument

  by - `int`"
  ([^SequenceElement this ^Integer by]
    (-> this (.increaseElementFrequency by))))

(defn set-points
  "Sets Huffman tree points

  points - `java.util.List`"
  ([^SequenceElement this ^java.util.List points]
    (-> this (.setPoints points))))

(defn increment-sequences-count
  "Increments document count by specified value

  count - `long`"
  ([^SequenceElement this ^Long count]
    (-> this (.incrementSequencesCount count)))
  ([^SequenceElement this]
    (-> this (.incrementSequencesCount))))

(defn mark-as-label
  "This method specifies, whether this element should be treated as label for some sequence/document or not.

  is-label - `boolean`"
  ([^SequenceElement this ^Boolean is-label]
    (-> this (.markAsLabel is-label))))

(defn set-code-length
  "This method fills codes and points up to codeLength

  code-length - `short`"
  ([^SequenceElement this ^Short code-length]
    (-> this (.setCodeLength code-length))))

(defn get-label
  "This method should return string representation of this SequenceElement, so it can be used for

  returns: `java.lang.String`"
  (^java.lang.String [^SequenceElement this]
    (-> this (.getLabel))))

(defn set-index
  "Sets index in Huffman tree

  index - `int`"
  ([^SequenceElement this ^Integer index]
    (-> this (.setIndex index))))

(defn increment-element-frequency
  "Increases element frequency counter by 1"
  ([^SequenceElement this]
    (-> this (.incrementElementFrequency))))

(defn hash-code
  "hashCode method override should be properly implemented for any extended class, otherwise it will be based on label hashCode

  returns: hashCode for this SequenceElement - `int`"
  (^Integer [^SequenceElement this]
    (-> this (.hashCode))))

(defn get-gradient
  "Deprecated.

  index - `int`
  g - `double`
  lr - `double`

  returns: `double`"
  (^Double [^SequenceElement this ^Integer index ^Double g ^Double lr]
    (-> this (.getGradient index g lr))))

(defn compare-to
  "o - `org.deeplearning4j.models.sequencevectors.sequence.SequenceElement`

  returns: `int`"
  (^Integer [^SequenceElement this ^org.deeplearning4j.models.sequencevectors.sequence.SequenceElement o]
    (-> this (.compareTo o))))

(defn get-storage-id
  "returns: `java.lang.Long`"
  (^java.lang.Long [^SequenceElement this]
    (-> this (.getStorageId))))

(defn equals
  "Equals method override should be properly implemented for any extended class, otherwise it will be based on label equality

  object - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^SequenceElement this ^java.lang.Object object]
    (-> this (.equals object))))

(defn get-sequences-count
  "This method returns number of documents/sequences where this element was evidenced

  returns: `long`"
  (^Long [^SequenceElement this]
    (-> this (.getSequencesCount))))

(defn set-codes
  "Sets Huffman tree codes

  codes - `java.util.List`"
  ([^SequenceElement this ^java.util.List codes]
    (-> this (.setCodes codes))))

(defn to-json
  "returns: `java.lang.String`"
  (^java.lang.String [^SequenceElement this]
    (-> this (.toJSON))))

