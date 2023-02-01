
import { Button, StyleSheet, Text, TextInput, View } from 'react-native';

export default function App() {
  return (
    <View style={styles.container}>
     <View style={styles.inputContainer}>
      <TextInput style={styles.textInput} placeholder='Your course goal!'/>
      <Button title='Add Goal' />
     </View>
     <View style={styles.goalsContainer}>
      <Text>List of goals...</Text>
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
  flex:5
 }
});
