(ns org.deeplearning4j.models.embeddings.loader.WordVectorSerializer
  "This is utility class, providing various methods for WordVectors serialization"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.models.embeddings.loader WordVectorSerializer]))

(defn *print-out-projected-memory-use
  "num-words - `long`
  vector-length - `int`
  num-tables - `int`"
  ([^Long num-words ^Integer vector-length ^Integer num-tables]
    (WordVectorSerializer/printOutProjectedMemoryUse num-words vector-length num-tables)))

(defn *decode-b-64
  "word - `java.lang.String`

  returns: `java.lang.String`"
  (^java.lang.String [^java.lang.String word]
    (WordVectorSerializer/decodeB64 word)))

(defn *write-sequence-vectors
  "This method saves specified SequenceVectors model to target file path

  vectors - SequenceVectors model - `org.deeplearning4j.models.sequencevectors.SequenceVectors`
  factory - SequenceElementFactory implementation for your objects - `org.deeplearning4j.models.sequencevectors.interfaces.SequenceElementFactory`
  path - Target output file path - `java.lang.String`

  returns: `<T extends org.deeplearning4j.models.sequencevectors.sequence.SequenceElement> void`

  throws: java.io.IOException"
  ([^org.deeplearning4j.models.sequencevectors.SequenceVectors vectors ^org.deeplearning4j.models.sequencevectors.interfaces.SequenceElementFactory factory ^java.lang.String path]
    (WordVectorSerializer/writeSequenceVectors vectors factory path)))

(defn *load-static-model
  "This method restores previously saved w2v model. File can be in one of the following formats:
  1) Binary model, either compressed or not. Like well-known Google Model
  2) Popular CSV word2vec text format
  3) DL4j compressed format
  In return you get StaticWord2Vec model, which might be used as lookup table only in multi-gpu environment.

  file - File should point to previously saved w2v model - `java.io.File`

  returns: `org.deeplearning4j.models.embeddings.wordvectors.WordVectors`"
  (^org.deeplearning4j.models.embeddings.wordvectors.WordVectors [^java.io.File file]
    (WordVectorSerializer/loadStaticModel file)))

(defn *read-word-2-vec
  "Deprecated.

  file - `java.io.File`

  returns: `org.deeplearning4j.models.word2vec.Word2Vec`

  throws: java.io.IOException"
  (^org.deeplearning4j.models.word2vec.Word2Vec [^java.io.File file]
    (WordVectorSerializer/readWord2Vec file)))

(defn *read-word-2-vec-model
  "This method
  1) Binary model, either compressed or not. Like well-known Google Model
  2) Popular CSV word2vec text format
  3) DL4j compressed format
  Please note: if extended data isn't available, only weights will be loaded instead.

  path - `java.lang.String`
  extended-model - if TRUE, we'll try to load HS states & Huffman tree info, if FALSE, only weights will be loaded - `boolean`

  returns: `org.deeplearning4j.models.word2vec.Word2Vec`"
  (^org.deeplearning4j.models.word2vec.Word2Vec [^java.lang.String path ^Boolean extended-model]
    (WordVectorSerializer/readWord2VecModel path extended-model))
  (^org.deeplearning4j.models.word2vec.Word2Vec [^java.io.File file]
    (WordVectorSerializer/readWord2VecModel file)))

(defn *from-pair
  "Load word vectors from the given pair

  pair - the given pair - `org.nd4j.linalg.primitives.Pair`

  returns: a read only word vectors impl based on the given lookup table and vocab - `org.deeplearning4j.models.word2vec.Word2Vec`"
  (^org.deeplearning4j.models.word2vec.Word2Vec [^org.nd4j.linalg.primitives.Pair pair]
    (WordVectorSerializer/fromPair pair)))

(defn *read-paragraph-vectors-from-text
  "Deprecated. Use readParagraphVectors() method instead

  path - Path to file that contains previously serialized model - `java.lang.String`

  returns: `org.deeplearning4j.models.paragraphvectors.ParagraphVectors`"
  (^org.deeplearning4j.models.paragraphvectors.ParagraphVectors [^java.lang.String path]
    (WordVectorSerializer/readParagraphVectorsFromText path)))

(defn *load-txt-vectors
  "Deprecated.

  vectors-file - the path of the file to load\\ - `java.io.File`

  returns: `org.deeplearning4j.models.embeddings.wordvectors.WordVectors`

  throws: java.io.FileNotFoundException - if the file does not exist"
  (^org.deeplearning4j.models.embeddings.wordvectors.WordVectors [^java.io.File vectors-file]
    (WordVectorSerializer/loadTxtVectors vectors-file))
  (^org.deeplearning4j.models.embeddings.wordvectors.WordVectors [^java.io.InputStream stream ^Boolean skip-first-line]
    (WordVectorSerializer/loadTxtVectors stream skip-first-line)))

(defn *write-tsne-format
  "Write the tsne format

  vec - the word vectors to use for labeling - `org.deeplearning4j.models.glove.Glove`
  tsne - the tsne array to write - `org.nd4j.linalg.api.ndarray.INDArray`
  csv - the file to use - `java.io.File`

  throws: java.lang.Exception"
  ([^org.deeplearning4j.models.glove.Glove vec ^org.nd4j.linalg.api.ndarray.INDArray tsne ^java.io.File csv]
    (WordVectorSerializer/writeTsneFormat vec tsne csv)))

(defn *read-float
  "Read a float from a data input stream Credit to:
  https://github.com/NLPchina/Word2VEC_java/blob/master/src/com/ansj/vec/Word2VEC.java

  is - `java.io.InputStream`

  returns: `float`

  throws: java.io.IOException"
  (^Float [^java.io.InputStream is]
    (WordVectorSerializer/readFloat is)))

(defn *read-word-2-vec-from-text
  "This method allows you to read ParagraphVectors from externally originated vectors and syn1.
  So, technically this method is compatible with any other w2v implementation

  vectors - text file with words and their weights, aka Syn0 - `java.io.File`
  hs - text file HS layers, aka Syn1 - `java.io.File`
  h-codes - text file with Huffman tree codes - `java.io.File`
  h-points - text file with Huffman tree points - `java.io.File`
  configuration - `org.deeplearning4j.models.embeddings.loader.VectorsConfiguration`

  returns: `org.deeplearning4j.models.word2vec.Word2Vec`

  throws: java.io.IOException"
  (^org.deeplearning4j.models.word2vec.Word2Vec [^java.io.File vectors ^java.io.File hs ^java.io.File h-codes ^java.io.File h-points ^org.deeplearning4j.models.embeddings.loader.VectorsConfiguration configuration]
    (WordVectorSerializer/readWord2VecFromText vectors hs h-codes h-points configuration)))

(defn *read-paragraph-vectors
  "This method restores ParagraphVectors model previously saved with writeParagraphVectors()

  path - `java.lang.String`

  returns: `org.deeplearning4j.models.paragraphvectors.ParagraphVectors`

  throws: java.io.IOException"
  (^org.deeplearning4j.models.paragraphvectors.ParagraphVectors [^java.lang.String path]
    (WordVectorSerializer/readParagraphVectors path)))

(defn *read-vocab-cache
  "This method reads vocab cache from provided file.
  Please note: it reads only vocab content, so it's suitable mostly for BagOfWords/TF-IDF vectorizers

  file - `java.io.File`

  returns: `org.deeplearning4j.models.word2vec.wordstore.VocabCache<org.deeplearning4j.models.word2vec.VocabWord>`

  throws: java.io.IOException"
  (^org.deeplearning4j.models.word2vec.wordstore.VocabCache [^java.io.File file]
    (WordVectorSerializer/readVocabCache file)))

(defn *read-binary-model
  "Read a binary word2vec file.

  model-file - the File to read - `java.io.File`
  linebreaks - if true, the reader expects each word/vector to be in a separate line, terminatedby a line break - `boolean`
  normalize - `boolean`

  returns: a model - `org.deeplearning4j.models.word2vec.Word2Vec`

  throws: java.lang.NumberFormatException"
  (^org.deeplearning4j.models.word2vec.Word2Vec [^java.io.File model-file ^Boolean linebreaks ^Boolean normalize]
    (WordVectorSerializer/readBinaryModel model-file linebreaks normalize)))

(defn *write-word-vectors
  "This method writes word vectors to the given path.
  Please note: this method doesn't load whole vocab/lookupTable into memory, so it's able to process large vocabularies served over network.

  lookup-table - `org.deeplearning4j.models.embeddings.WeightLookupTable`
  path - `java.lang.String`

  returns: `<T extends org.deeplearning4j.models.sequencevectors.sequence.SequenceElement> void`

  throws: java.io.IOException"
  ([^org.deeplearning4j.models.embeddings.WeightLookupTable lookup-table ^java.lang.String path]
    (WordVectorSerializer/writeWordVectors lookup-table path))
  ([^org.deeplearning4j.models.embeddings.inmemory.InMemoryLookupTable lookup-table ^org.deeplearning4j.models.word2vec.wordstore.inmemory.InMemoryLookupCache cache ^java.lang.String path]
    (WordVectorSerializer/writeWordVectors lookup-table cache path)))

(defn *write-full-model
  "Deprecated. Use writeWord2VecModel() method instead

  vec - - The Word2Vec instance to be saved - `org.deeplearning4j.models.word2vec.Word2Vec`
  path - - the path for json to be saved - `java.lang.String`"
  ([^org.deeplearning4j.models.word2vec.Word2Vec vec ^java.lang.String path]
    (WordVectorSerializer/writeFullModel vec path)))

(defn *write-word-2-vec-model
  "This method saves Word2Vec model into compressed zip file and sends it to output stream
  PLEASE NOTE: This method saves FULL model, including syn0 AND syn1

  vectors - `org.deeplearning4j.models.word2vec.Word2Vec`
  file - `java.io.File`"
  ([^org.deeplearning4j.models.word2vec.Word2Vec vectors ^java.io.File file]
    (WordVectorSerializer/writeWord2VecModel vectors file)))

(defn *read-string
  "Read a string from a data input stream Credit to:
  https://github.com/NLPchina/Word2VEC_java/blob/master/src/com/ansj/vec/Word2VEC.java

  dis - `java.io.DataInputStream`

  returns: `java.lang.String`

  throws: java.io.IOException"
  (^java.lang.String [^java.io.DataInputStream dis]
    (WordVectorSerializer/readString dis)))

(defn *load-full-model
  "Deprecated. Use readWord2VecModel() or loadStaticModel() method instead

  path - - path to previously stored w2v json model - `java.lang.String`

  returns: - Word2Vec instance - `org.deeplearning4j.models.word2vec.Word2Vec`

  throws: java.io.FileNotFoundException"
  (^org.deeplearning4j.models.word2vec.Word2Vec [^java.lang.String path]
    (WordVectorSerializer/loadFullModel path)))

(defn *from-table-and-vocab
  "Load word vectors for the given vocab and table

  table - the weights to use - `org.deeplearning4j.models.embeddings.WeightLookupTable`
  vocab - the vocab to use - `org.deeplearning4j.models.word2vec.wordstore.VocabCache`

  returns: wordvectors based on the given parameters - `org.deeplearning4j.models.embeddings.wordvectors.WordVectors`"
  (^org.deeplearning4j.models.embeddings.wordvectors.WordVectors [^org.deeplearning4j.models.embeddings.WeightLookupTable table ^org.deeplearning4j.models.word2vec.wordstore.VocabCache vocab]
    (WordVectorSerializer/fromTableAndVocab table vocab)))

(defn *write-paragraph-vectors
  "This method saves ParagraphVectors model into compressed zip file

  vectors - `org.deeplearning4j.models.paragraphvectors.ParagraphVectors`
  file - `java.io.File`"
  ([^org.deeplearning4j.models.paragraphvectors.ParagraphVectors vectors ^java.io.File file]
    (WordVectorSerializer/writeParagraphVectors vectors file)))

(defn *encode-b-64
  "word - `java.lang.String`

  returns: `java.lang.String`"
  (^java.lang.String [^java.lang.String word]
    (WordVectorSerializer/encodeB64 word)))

(defn *get-float
  "Read a string from a data input stream Credit to:
  https://github.com/NLPchina/Word2VEC_java/blob/master/src/com/ansj/vec/Word2VEC.java

  b - `byte[]`

  returns: `float`

  throws: java.io.IOException"
  (^Float [b]
    (WordVectorSerializer/getFloat b)))

(defn *write-vocab-cache
  "This method saves vocab cache to provided File.
  Please note: it saves only vocab content, so it's suitable mostly for BagOfWords/TF-IDF vectorizers

  vocab-cache - `org.deeplearning4j.models.word2vec.wordstore.VocabCache`
  file - `java.io.File`

  throws: java.io.UnsupportedEncodingException"
  ([^org.deeplearning4j.models.word2vec.wordstore.VocabCache vocab-cache ^java.io.File file]
    (WordVectorSerializer/writeVocabCache vocab-cache file)))

(defn *load-txt
  "Loads an in memory cache from the given path (sets syn0 and the vocab)

  vectors-file - the path of the file to load - `java.io.File`

  returns: a Pair holding the lookup table and the vocab cache. - `org.nd4j.linalg.primitives.Pair<org.deeplearning4j.models.embeddings.inmemory.InMemoryLookupTable,org.deeplearning4j.models.word2vec.wordstore.VocabCache>`

  throws: java.io.FileNotFoundException - if the input file does not exist"
  (^org.nd4j.linalg.primitives.Pair [^java.io.File vectors-file]
    (WordVectorSerializer/loadTxt vectors-file)))

(defn *read-sequence-vectors
  "This method loads previously saved SequenceVectors model from File

  factory - `org.deeplearning4j.models.sequencevectors.interfaces.SequenceElementFactory`
  file - `java.io.File`

  returns: `<T extends org.deeplearning4j.models.sequencevectors.sequence.SequenceElement> org.deeplearning4j.models.sequencevectors.SequenceVectors<T>`

  throws: java.io.IOException"
  ([^org.deeplearning4j.models.sequencevectors.interfaces.SequenceElementFactory factory ^java.io.File file]
    (WordVectorSerializer/readSequenceVectors factory file)))

