(ns org.deeplearning4j.text.documentiterator.LabelsSource
  "This class is used to manage labels/documents syncronization over iterators"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.text.documentiterator LabelsSource]))

(defn ->labels-source
  "Constructor.

  Build LabelsSource using string template.
  Template can be raw string, in this case document counter will be appended to resulting label.
  I.e. \"SENT_\" template will produce labels SENT_0, SENT_1, SENT_2 etc.
  You can also use %d formatter tag, which will be replaced with counter.
  I.e. \"SENT_%i_FLOW_1\" will produce labels \"SENT_0_FLOW_1\", \"SENT_1_FLOW_1\", \"SENT_2_FLOW_1\" etc

  template - `java.lang.String`"
  (^LabelsSource [^java.lang.String template]
    (new LabelsSource template))
  (^LabelsSource []
    (new LabelsSource )))

(defn index-of
  "label - `java.lang.String`

  returns: `int`"
  (^Integer [^LabelsSource this ^java.lang.String label]
    (-> this (.indexOf label))))

(defn size
  "returns: `int`"
  (^Integer [^LabelsSource this]
    (-> this (.size))))

(defn next-label
  "Returns next label.

  returns: next label, generated or predefined one - `java.lang.String`"
  (^java.lang.String [^LabelsSource this]
    (-> this (.nextLabel))))

(defn get-labels
  "This method returns the list of labels used by this generator instance.
  If external list os labels was used as source, whole list will be returned.

  returns: list of labels - `java.util.List<java.lang.String>`"
  (^java.util.List [^LabelsSource this]
    (-> this (.getLabels))))

(defn store-label
  "This method is intended for storing labels retrieved from external sources.

  label - `java.lang.String`"
  ([^LabelsSource this ^java.lang.String label]
    (-> this (.storeLabel label))))

(defn reset
  "This method should be called from Iterator's reset() method, to keep labels in sync with iterator"
  ([^LabelsSource this]
    (-> this (.reset))))

(defn get-number-of-labels-used
  "This method returns number of labels used up to the method's call

  returns: `int`"
  (^Integer [^LabelsSource this]
    (-> this (.getNumberOfLabelsUsed))))

