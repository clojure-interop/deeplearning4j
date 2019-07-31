(ns org.deeplearning4j.text.corpora.treeparser.TreeParser
  "Tree parser for constituency parsing"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.text.corpora.treeparser TreeParser]))

(defn ->tree-parser
  "Constructor.

  parser - `org.apache.uima.analysis_engine.AnalysisEngine`
  tokenizer - `org.apache.uima.analysis_engine.AnalysisEngine`
  pool - `org.apache.uima.util.CasPool`"
  (^TreeParser [^org.apache.uima.analysis_engine.AnalysisEngine parser ^org.apache.uima.analysis_engine.AnalysisEngine tokenizer ^org.apache.uima.util.CasPool pool]
    (new TreeParser parser tokenizer pool))
  (^TreeParser []
    (new TreeParser )))

(defn *get-tokenizer
  "returns: `org.apache.uima.analysis_engine.AnalysisEngine`

  throws: java.lang.Exception"
  (^org.apache.uima.analysis_engine.AnalysisEngine []
    (TreeParser/getTokenizer )))

(defn *get-parser
  "returns: `org.apache.uima.analysis_engine.AnalysisEngine`

  throws: java.lang.Exception"
  (^org.apache.uima.analysis_engine.AnalysisEngine []
    (TreeParser/getParser )))

(defn get-trees
  "Gets trees from text.
  First a sentence segmenter is used to segment the training examples in to sentences.
  Sentences are then turned in to trees and returned.

  text - the text to process - `java.lang.String`
  pre-processor - the pre processor to use for pre processing sentences - `org.deeplearning4j.text.sentenceiterator.SentencePreProcessor`

  returns: the list of trees - `java.util.List<org.deeplearning4j.nn.layers.feedforward.autoencoder.recursive.Tree>`

  throws: java.lang.Exception"
  (^java.util.List [^TreeParser this ^java.lang.String text ^org.deeplearning4j.text.sentenceiterator.SentencePreProcessor pre-processor]
    (-> this (.getTrees text pre-processor)))
  (^java.util.List [^TreeParser this ^java.lang.String text]
    (-> this (.getTrees text))))

(defn get-treebank-trees
  "Gets trees from text.
  First a sentence segmenter is used to segment the training examples in to sentences.
  Sentences are then turned in to trees and returned.

  text - the text to process - `java.lang.String`

  returns: the list of trees - `java.util.List<org.cleartk.syntax.constituent.type.TreebankNode>`

  throws: java.lang.Exception"
  (^java.util.List [^TreeParser this ^java.lang.String text]
    (-> this (.getTreebankTrees text))))

(defn get-trees-with-labels
  "Gets trees from text.
  First a sentence segmenter is used to segment the training examples in to sentences.
  Sentences are then turned in to trees and returned.
  This will also process sentences with the following label format:
   some text
  This will allow you to iterate on and label sentences and label spans yourself.

  text - the text to process - `java.lang.String`
  label - the label for the whole sentence - `java.lang.String`
  labels - the possible labels for the sentence - `java.util.List`

  returns: the list of trees - `java.util.List<org.deeplearning4j.nn.layers.feedforward.autoencoder.recursive.Tree>`

  throws: java.lang.Exception"
  (^java.util.List [^TreeParser this ^java.lang.String text ^java.lang.String label ^java.util.List labels]
    (-> this (.getTreesWithLabels text label labels)))
  (^java.util.List [^TreeParser this ^java.lang.String text ^java.util.List labels]
    (-> this (.getTreesWithLabels text labels))))

