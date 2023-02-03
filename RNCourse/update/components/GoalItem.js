import {StyleSheet, View, Text} from 'react-native';

function GoalItem(props){
    return <View style={styles.goalItem}>
    <Text style={styles.goalText}>{props.text}</Text>
  </View>
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