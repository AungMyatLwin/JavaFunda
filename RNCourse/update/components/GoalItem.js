import {StyleSheet, View, Text, Pressable} from 'react-native';

function GoalItem(props){
  // helper function

    return <Pressable android_ripple={{color:"#dddddd"}}onPress={props.onDelete.bind(this, props.id)} >
      <View style={styles.goalItem}>
    <Text style={styles.goalText}>{props.text}</Text>
  </View>
    </Pressable>
}


export default GoalItem;

const styles= StyleSheet.create({
  goalItem:{
    borderColor:'#cccccc',
    borderWidth:1,
    margin:8,
    borderRadius:6,
    backgroundColor:'#5e08ff',
    padding:8,
   },
       goalText:{
        color:'white'
       }
});