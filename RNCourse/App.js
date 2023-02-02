import { useState } from 'react';
import { Button, StyleSheet, Text, TextInput, View } from 'react-native';

export default function App() {
  const [enteredGoalText, setEnteredGoalText]= useState('');
  const [courseGoal,setCourseGoal]=useState([]);
  function goalInputHandler(enteredText){
    setEnteredGoalText(enteredText);
  };
  function addGoalHandler(){
    setCourseGoal(currentCourseGoal=>[...currentCourseGoal,enteredGoalText]);

  };
  return (
    <View style={styles.container}>
     <View style={styles.inputContainer}>
      <TextInput style={styles.textInput} placeholder='Your course goal!' onChangeText={goalInputHandler}/>
      <Button title='Add Goal' onPress={addGoalHandler} />
     </View>
     <View style={styles.goalsContainer}>
      {courseGoal.map(goal=> {return(
        <View style={styles.goalItem} key={goal}>
          <Text style={styles.goalText}>{goal}</Text>
        </View>
      );})}
     </View>
    </View>
    
  );
}

const styles = StyleSheet.create({
 container:{
  padding:40,
  paddingHorizontal:16,
  flex:1
 },
 inputContainer:{
  flex:1,
  flexDirection:'row',
  justifyContent: 'space-between',
  alignItems:'center',
  marginBottom:24,
  borderWidth:1,
  borderColor:'#cccccc'
 },
 textInput:{
  borderWidth:1,
  borderColor:'#cccccc',
  width:'60%',
  marginRight:8,
  padding:8
 },
 goalsContainer:{
  flex:6,
 },
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
