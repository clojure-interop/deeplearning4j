(ns org.deeplearning4j.nn.modelexport.solr.ltr.model.ScoringModel
  "An
 org.apache.solr.ltr.model.LTRScoringModel that computes scores using a MultiLayerNetwork or
 ComputationGraph model.

 Example configuration (snippet):


 {
   \"class\" : \"org.deeplearning4j.nn.modelexport.solr.ltr.model.ScoringModel\",
   \"name\" : \"myModel\",
   \"features\" : [
     { \"name\" : \"documentRecency\", ... },
     { \"name\" : \"isBook\", ... },
     { \"name\" : \"originalScore\", ... }
   ],
   \"params\" : {
     \"serializedModelFileName\" : \"mySerializedModel\"
   }
 }

 Apache Solr Reference Guide:

  Learning To Rank"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.nn.modelexport.solr.ltr.model ScoringModel]))

(defn ->scoring-model
  "Constructor.

  name - `java.lang.String`
  features - `java.util.List`
  norms - `java.util.List`
  feature-store-name - `java.lang.String`
  all-features - `java.util.List`
  params - `java.util.Map`"
  (^ScoringModel [^java.lang.String name ^java.util.List features ^java.util.List norms ^java.lang.String feature-store-name ^java.util.List all-features ^java.util.Map params]
    (new ScoringModel name features norms feature-store-name all-features params)))

(defn *output-score
  "Uses the NetworkUtils.output(Model, INDArray) method.

  model - `org.deeplearning4j.nn.api.Model`
  model-feature-values-normalized - `float[]`

  returns: `float`"
  (^Float [^org.deeplearning4j.nn.api.Model model model-feature-values-normalized]
    (ScoringModel/outputScore model model-feature-values-normalized)))

(defn set-serialized-model-file-name
  "serialized-model-file-name - `java.lang.String`"
  ([^ScoringModel this ^java.lang.String serialized-model-file-name]
    (-> this (.setSerializedModelFileName serialized-model-file-name))))

(defn init
  "solr-resource-loader - `org.apache.solr.core.SolrResourceLoader`

  throws: org.apache.solr.ltr.model.ModelException"
  ([^ScoringModel this ^org.apache.solr.core.SolrResourceLoader solr-resource-loader]
    (-> this (.init solr-resource-loader))))

(defn score
  "model-feature-values-normalized - `float[]`

  returns: `float`"
  (^Float [^ScoringModel this model-feature-values-normalized]
    (-> this (.score model-feature-values-normalized))))

(defn explain
  "context - `org.apache.lucene.index.LeafReaderContext`
  doc - `int`
  final-score - `float`
  feature-explanations - `java.util.List`

  returns: `org.apache.lucene.search.Explanation`"
  (^org.apache.lucene.search.Explanation [^ScoringModel this ^org.apache.lucene.index.LeafReaderContext context ^Integer doc ^Float final-score ^java.util.List feature-explanations]
    (-> this (.explain context doc final-score feature-explanations))))

