import { useState } from 'react';
import { FlatList, StyleSheet, View } from 'react-native';

import GoalItem from './update/components/GoalItem';
import GoalInput from './update/components/GoalInput';

export default function App() {
  
  const [courseGoal,setCourseGoal]=useState([]);

  function addGoalHandler(enteredGoalText){
    setCourseGoal(currentCourseGoal=>[...currentCourseGoal,
      {text:enteredGoalText, id:Math.random().toString()}]);
  };

  return (
    <View style={styles.container}>
    <GoalInput goalFunction={addGoalHandler} />
     <FlatList data={courseGoal} renderItem={itemData=>{
      return( <GoalItem text={itemData.item.text}/>
      )
     }} style={styles.goalsContainer} keyExtractor={
      (item,index)=> { return item.id;}
     }/>
    </View>
  );
}

const styles = StyleSheet.create({
  container:{
    padding:40,
    paddingHorizontal:16,
    flex:1
   },
   goalsContainer:{
    flex:6,
   }
});
