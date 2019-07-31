(ns org.datavec.api.transform.serde.BaseSerializer
  "Abstract serializer for mapping Transforms, Conditions, Filters, DataActions etc to/from JSON.
 Also: lists and arrays of these."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.api.transform.serde BaseSerializer]))

(defn ->base-serializer
  "Constructor."
  (^BaseSerializer []
    (new BaseSerializer )))

(defn deserialize-data-action
  "Deserialize a DataAction serialized using serialize(Object)

  str - String representation (YAML/JSON) of the DataAction - `java.lang.String`

  returns: DataAction - `org.datavec.api.transform.DataAction`"
  (^org.datavec.api.transform.DataAction [^BaseSerializer this ^java.lang.String str]
    (-> this (.deserializeDataAction str))))

(defn deserialize-data-action-list
  "Deserialize a DataAction List serialized using serializeDataActionList(List), or
  an array serialized using serialize(DataAction[])

  str - String representation (YAML/JSON) of the DataAction list - `java.lang.String`

  returns: List<DataAction> - `java.util.List<org.datavec.api.transform.DataAction>`"
  (^java.util.List [^BaseSerializer this ^java.lang.String str]
    (-> this (.deserializeDataActionList str))))

(defn serialize
  "Serialize the specified object, such as a Transform, Condition, Filter, etc
  NOTE: For lists use the list methods, such as serializeTransformList(List)

  To deserialize, use the appropriate method: deserializeTransform(String) for example.

  o - Object to serialize - `java.lang.Object`

  returns: String (json/yaml) representation of the object - `java.lang.String`"
  (^java.lang.String [^BaseSerializer this ^java.lang.Object o]
    (-> this (.serialize o))))

(defn serialize-condition-list
  "Serialize a list of Conditions

  list - `java.util.List`

  returns: `java.lang.String`"
  (^java.lang.String [^BaseSerializer this ^java.util.List list]
    (-> this (.serializeConditionList list))))

(defn get-object-mapper
  "returns: `org.nd4j.shade.jackson.databind.ObjectMapper`"
  (^org.nd4j.shade.jackson.databind.ObjectMapper [^BaseSerializer this]
    (-> this (.getObjectMapper))))

(defn deserialize-sequence-comparator-list
  "Deserialize a SequenceComparator List serialized using serializeSequenceComparatorList(List), or
  an array serialized using serialize(SequenceComparator[])

  str - String representation (YAML/JSON) of the SequenceComparator list - `java.lang.String`

  returns: List<SequenceComparator> - `java.util.List<org.datavec.api.transform.sequence.SequenceComparator>`"
  (^java.util.List [^BaseSerializer this ^java.lang.String str]
    (-> this (.deserializeSequenceComparatorList str))))

(defn deserialize-sequence-comparator
  "Deserialize a SequenceComparator serialized using serialize(Object)

  str - String representation (YAML/JSON) of the SequenceComparator - `java.lang.String`

  returns: SequenceComparator - `org.datavec.api.transform.sequence.SequenceComparator`"
  (^org.datavec.api.transform.sequence.SequenceComparator [^BaseSerializer this ^java.lang.String str]
    (-> this (.deserializeSequenceComparator str))))

(defn deserialize-transform
  "Deserialize a Transform serialized using serialize(Object)

  str - String representation (YAML/JSON) of the Transform - `java.lang.String`

  returns: Transform - `org.datavec.api.transform.Transform`"
  (^org.datavec.api.transform.Transform [^BaseSerializer this ^java.lang.String str]
    (-> this (.deserializeTransform str))))

(defn deserialize-sequence-split
  "Deserialize a SequenceSplit serialized using serialize(Object)

  str - String representation (YAML/JSON) of the SequenceSplit - `java.lang.String`

  returns: SequenceSplit - `org.datavec.api.transform.sequence.SequenceSplit`"
  (^org.datavec.api.transform.sequence.SequenceSplit [^BaseSerializer this ^java.lang.String str]
    (-> this (.deserializeSequenceSplit str))))

(defn serialize-transform-list
  "Serialize a list of Transforms

  list - `java.util.List`

  returns: `java.lang.String`"
  (^java.lang.String [^BaseSerializer this ^java.util.List list]
    (-> this (.serializeTransformList list))))

(defn serialize-sequence-comparator-list
  "Serialize a list of SequenceComparators

  list - `java.util.List`

  returns: `java.lang.String`"
  (^java.lang.String [^BaseSerializer this ^java.util.List list]
    (-> this (.serializeSequenceComparatorList list))))

(defn serialize-filter-list
  "Serialize a list of Filters

  list - `java.util.List`

  returns: `java.lang.String`"
  (^java.lang.String [^BaseSerializer this ^java.util.List list]
    (-> this (.serializeFilterList list))))

(defn serialize-reducer-list
  "Serialize a list of IReducers

  list - `java.util.List`

  returns: `java.lang.String`"
  (^java.lang.String [^BaseSerializer this ^java.util.List list]
    (-> this (.serializeReducerList list))))

(defn deserialize-filter-list
  "Deserialize a Filter List serialized using serializeFilterList(List), or
  an array serialized using serialize(Filter[])

  str - String representation (YAML/JSON) of the Filter list - `java.lang.String`

  returns: List<Filter> - `java.util.List<org.datavec.api.transform.filter.Filter>`"
  (^java.util.List [^BaseSerializer this ^java.lang.String str]
    (-> this (.deserializeFilterList str))))

(defn serialize-data-action-list
  "Serialize a list of DataActions

  list - `java.util.List`

  returns: `java.lang.String`"
  (^java.lang.String [^BaseSerializer this ^java.util.List list]
    (-> this (.serializeDataActionList list))))

(defn deserialize-filter
  "Deserialize a Filter serialized using serialize(Object)

  str - String representation (YAML/JSON) of the Filter - `java.lang.String`

  returns: Filter - `org.datavec.api.transform.filter.Filter`"
  (^org.datavec.api.transform.filter.Filter [^BaseSerializer this ^java.lang.String str]
    (-> this (.deserializeFilter str))))

(defn deserialize-transform-list
  "Deserialize a Transform List serialized using serializeTransformList(List), or
  an array serialized using serialize(Transform[])

  str - String representation (YAML/JSON) of the Transform list - `java.lang.String`

  returns: List<Transform> - `java.util.List<org.datavec.api.transform.Transform>`"
  (^java.util.List [^BaseSerializer this ^java.lang.String str]
    (-> this (.deserializeTransformList str))))

(defn deserialize-condition-list
  "Deserialize a Condition List serialized using serializeConditionList(List), or
  an array serialized using serialize(Condition[])

  str - String representation (YAML/JSON) of the Condition list - `java.lang.String`

  returns: List<Condition> - `java.util.List<org.datavec.api.transform.condition.Condition>`"
  (^java.util.List [^BaseSerializer this ^java.lang.String str]
    (-> this (.deserializeConditionList str))))

(defn deserialize-reducer-list
  "Deserialize an IStringReducer List serialized using serializeReducerList(List), or
  an array serialized using #serialize(IReducer[])

  str - String representation (YAML/JSON) of the IStringReducer list - `java.lang.String`

  returns: List<IStringReducer> - `java.util.List<org.datavec.api.transform.reduce.IAssociativeReducer>`"
  (^java.util.List [^BaseSerializer this ^java.lang.String str]
    (-> this (.deserializeReducerList str))))

(defn deserialize-condition
  "Deserialize a Condition serialized using serialize(Object)

  str - String representation (YAML/JSON) of the Condition - `java.lang.String`

  returns: Condition - `org.datavec.api.transform.condition.Condition`"
  (^org.datavec.api.transform.condition.Condition [^BaseSerializer this ^java.lang.String str]
    (-> this (.deserializeCondition str))))

(defn deserialize-sorted-rank
  "Deserialize a CalculateSortedRank serialized using serialize(Object)

  str - String representation (YAML/JSON) of the CalculateSortedRank - `java.lang.String`

  returns: CalculateSortedRank - `org.datavec.api.transform.rank.CalculateSortedRank`"
  (^org.datavec.api.transform.rank.CalculateSortedRank [^BaseSerializer this ^java.lang.String str]
    (-> this (.deserializeSortedRank str))))

(defn deserialize-reducer
  "Deserialize an IStringReducer serialized using serialize(Object)

  str - String representation (YAML/JSON) of the IStringReducer - `java.lang.String`

  returns: IStringReducer - `org.datavec.api.transform.reduce.IAssociativeReducer`"
  (^org.datavec.api.transform.reduce.IAssociativeReducer [^BaseSerializer this ^java.lang.String str]
    (-> this (.deserializeReducer str))))

